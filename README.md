# Kodi Restarter per Firestick

App semplice per Amazon Firestick che riavvia Kodi con un solo click.

## Cosa fa
1. Chiude Kodi se è in esecuzione
2. Aspetta 1.5 secondi
3. Riavvia Kodi automaticamente
4. Si chiude da sola

## Come compilare

### Prerequisiti
- Android Studio installato
- Java Development Kit (JDK)

### Passi
1. Apri il progetto in Android Studio
2. Vai su `Build` → `Build Bundle(s) / APK(s)` → `Build APK(s)`
3. L'APK sarà in `app/build/outputs/apk/debug/app-debug.apk`

## Come installare su Firestick

### Metodo 1: Downloader
1. Sul Firestick, vai in Impostazioni → Il mio Fire TV → Opzioni sviluppatore
2. Attiva "App da fonti sconosciute" e "Debug ADB"
3. Installa l'app "Downloader" dall'Amazon App Store
4. Carica l'APK su un server web o usa un servizio di file sharing
5. Usa Downloader per scaricare e installare l'APK

### Metodo 2: ADB (da PC)
1. Sul Firestick, attiva Debug ADB (come sopra)
2. Sul PC, installa ADB
3. Collega il PC al Firestick sulla stessa rete:
   ```
   adb connect [IP_DEL_FIRESTICK]
   adb install app-debug.apk
   ```

## Utilizzo
1. Trova l'icona "Kodi Restarter" nel launcher del Firestick
2. Clicca sull'icona
3. Kodi si riavvierà automaticamente!

## Note
- L'app non ha interfaccia grafica, si avvia e si chiude subito
- Funziona meglio se aggiungi l'icona ai preferiti per accesso rapido
- Il package name di Kodi è "org.xbmc.kodi" - se usi una versione modificata, 
  dovrai cambiare il valore di KODI_PACKAGE nel codice

## Personalizzazione
Nel file `MainActivity.java` puoi modificare:
- `RESTART_DELAY`: tempo di attesa in millisecondi prima di riavviare Kodi (default 1500ms)
- `KODI_PACKAGE`: nome del package se usi una versione custom di Kodi
