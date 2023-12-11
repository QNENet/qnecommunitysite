package com.qnenet.community.keystore;

import com.qnenet.community.paths.QNEPaths;
import com.qnenet.qneobjects.QNEObjects;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Random;

@Service
public class QKeystore {

    private final QNEPaths qnePaths;
    private final QNEObjects qobjs;
    private final Path keystorePwdFilePath;
    private char[] keystorePwd;
    private Path keystoreFilePath;
    private KeyStore keyStore;

    public QKeystore(QNEPaths qnePaths) {
        Security.addProvider(new BouncyCastleProvider());

        qobjs = new QNEObjects();
        this.qnePaths = qnePaths;
        keystoreFilePath = Paths.get(qnePaths.getSystemPath().toString(), "keystore");
        keystorePwdFilePath = Paths.get(qnePaths.getSystemPath().toString(), "keystore");

        if (Files.notExists(keystoreFilePath)) {
            keyStore = createKeyStore();
            keystorePwd = generatePasswordChars(16);
            saveKeystorePassword();
            saveKeystore();
        } else {
            loadKeystorePassword();
            loadKeystore();
        }
    }

    private void saveKeystorePassword() {
        qobjs.saveObjToFile(keystorePwdFilePath, keystorePwd);
    }

    private void loadKeystorePassword() {
        keystorePwd = (char[]) qobjs.loadObjFromFile(keystorePwdFilePath);
    }

    private void saveKeystore() {
        saveKeyStore(keystoreFilePath, keyStore, keystorePwd);
    }

    private void loadKeystore() {
        keyStore = loadKeyStore(keystoreFilePath, keystorePwd);
    }

    public char[] generatePasswordChars(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*()_+[{]}|;:,<.>";
        char[] options = characters.toCharArray();
        char[] result = new char[length];
        Random r = new SecureRandom();
        for (int i = 0; i < result.length; i++) {
            result[i] = options[r.nextInt(options.length)];
        }
        System.out.println("Harder Password -> " + result);

        return result;
    }

    public KeyStore createKeyStore() {
        KeyStore keyStore = null;
        try {
            keyStore = KeyStore.getInstance("PKCS12", "BC");
            keyStore.load(null, null);
            return keyStore;
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (NoSuchProviderException e) {
            throw new RuntimeException(e);
        } catch (CertificateException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

    public KeyStore saveKeyStore(Path keyStoreFilePath, KeyStore keyStore, char[] ksPwd) {
        try {
            FileOutputStream fos = new FileOutputStream(keyStoreFilePath.toFile());
            keyStore.store(fos, ksPwd);
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CertificateException e) {
            throw new RuntimeException(e);
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        return keyStore;
    }


    public KeyStore loadKeyStore(Path keyStoreFilePath, char[] ksPwd) {
        KeyStore keyStore = null;
        try {
            keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            FileInputStream fis = new FileInputStream(keyStoreFilePath.toFile());
            keyStore.load(fis, ksPwd);
            return keyStore;
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CertificateException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

}
