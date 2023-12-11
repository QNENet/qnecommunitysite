package com.qnenet.community.paths;

import com.qnenet.community.constants.QSysConstants;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class QNEPaths {

    private final Path userHomePath;
    private final Path qnePath;
    private final Path systemPath;
    private final Path tmpPath;
//    private final Path keystoreFilePath;
    private final Path repositoryPath;


    public QNEPaths() throws IOException {
        userHomePath = Paths.get(System.getProperty("user.home"));
        qnePath = Paths.get(userHomePath.toString(), QSysConstants.APP_NAME);
        systemPath = Paths.get(qnePath.toString(), "system");
//        knownPath = Paths.get(systemPath.toString(), "known");
//        endPointsPath = Paths.get(systemPath.toString(), "endPoints");
        tmpPath = Paths.get(systemPath.toString(), "tmp");
        repositoryPath = Paths.get(qnePath.toString(), "repository");
//        keystoreFilePath = Paths.get(repositoryPath.toString(), "keystore.p12");
//        installPath = Paths.get(qnePath.toString(), "install");
//        installSystemPropsFilePath = Paths.get(installPath.toString(), "installer.props");
//        installerPropsFilePath = Paths.get(System.getProperty("user.home"), QSysConstants.APP_NAME, "install", "installer.props");
//        sysPropsMapFilePath = Paths.get(systemPath.toString(), "sysProps.map");

        if (Files.notExists(systemPath)) {
            Files.createDirectories(systemPath);
            Files.createDirectories(tmpPath);
            Files.createDirectories(repositoryPath);

        }
    }



    public Path getTmpPath() {
        return tmpPath;
    }

//    public Path getKeystoreFilePath() {
//        return null;
//    }



    public Path getSystemPath() {
        return systemPath;
    }

    public Path getRepositoryPath() {
        return repositoryPath;
    }



//    public Path getKeystoreFilePath() {
//        return keystoreFilePath;
//    }


}
