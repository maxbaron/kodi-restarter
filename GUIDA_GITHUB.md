# 🚀 Guida GitHub - Compilazione Automatica APK

## Passo 1: Crea un Account GitHub
1. Vai su https://github.com
2. Clicca "Sign up" e crea un account gratuito
3. Conferma la tua email

## Passo 2: Crea un Nuovo Repository
1. Una volta loggato, clicca il **+** in alto a destra
2. Seleziona **"New repository"**
3. Dai un nome al repository: `kodi-restarter`
4. Lascia tutto come "Public" (pubblico)
5. **NON** selezionare "Add a README file"
6. Clicca **"Create repository"**

## Passo 3: Carica i File

### Metodo A: Tramite Web (più semplice)
1. Nella pagina del repository vuoto, clicca **"uploading an existing file"**
2. Trascina TUTTI i file e cartelle dal progetto KodiRestarter
3. Assicurati di caricare:
   - La cartella `.github` (con il file workflow)
   - La cartella `app`
   - I file `build.gradle`, `settings.gradle`, `gradle.properties`
   - Il file `gradlew`
   - Il file `.gitignore`
   - Il `README.md`
4. Scrivi nel commit message: "Initial commit"
5. Clicca **"Commit changes"**

### Metodo B: Tramite Git (se conosci Git)
```bash
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/TUO_USERNAME/kodi-restarter.git
git push -u origin main
```

## Passo 4: Attiva GitHub Actions
1. Nel tuo repository, clicca sulla tab **"Actions"**
2. GitHub potrebbe chiederti di abilitare i workflow
3. Clicca **"I understand my workflows, go ahead and enable them"**
4. Il workflow partirà automaticamente!

## Passo 5: Scarica l'APK Compilato
1. Aspetta che il workflow finisca (icona verde ✓)
2. Clicca sul workflow completato
3. Scorri in basso fino a **"Artifacts"**
4. Clicca su **"kodi-restarter-apk"** per scaricare l'APK

---

## 🔄 Aggiornamenti Futuri
Ogni volta che fai modifiche e le carichi su GitHub:
1. GitHub Actions compilerà automaticamente un nuovo APK
2. Lo troverai sempre nella sezione Artifacts

## ❓ Problemi?
Se il workflow fallisce:
1. Clicca sul workflow fallito
2. Guarda i log per capire l'errore
3. Di solito è un problema di permessi sul file `gradlew`

## 📱 Installazione su Firestick
Una volta scaricato l'APK:
1. Caricalo su un server o Google Drive
2. Usa l'app "Downloader" sul Firestick
3. Inserisci l'URL del file APK
4. Installa e goditi!

---

**Tempo stimato: 10-15 minuti per il primo setup**
**Compilazione automatica: 5-7 minuti**
