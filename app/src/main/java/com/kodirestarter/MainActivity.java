package com.kodirestarter;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends Activity {
    
    private static final String KODI_PACKAGE = "org.xbmc.kodi";
    private static final int RESTART_DELAY = 1500; // 1.5 secondi di pausa
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Mostra messaggio
        Toast.makeText(this, "Riavvio Kodi...", Toast.LENGTH_SHORT).show();
        
        // Kill Kodi se è in esecuzione
        killKodi();
        
        // Aspetta un attimo e poi riavvia Kodi
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startKodi();
                finish(); // Chiude questa app
            }
        }, RESTART_DELAY);
    }
    
    private void killKodi() {
        try {
            ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
            if (am != null) {
                am.killBackgroundProcesses(KODI_PACKAGE);
            }
        } catch (Exception e) {
            // Ignora errori se Kodi non è in esecuzione
        }
    }
    
    private void startKodi() {
        try {
            PackageManager pm = getPackageManager();
            Intent intent = pm.getLaunchIntentForPackage(KODI_PACKAGE);
            
            if (intent != null) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Kodi non trovato!", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, "Errore nell'avvio di Kodi", Toast.LENGTH_LONG).show();
        }
    }
}
