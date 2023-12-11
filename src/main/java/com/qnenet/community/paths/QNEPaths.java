package com.qnenet.community.paths;

import com.qnenet.qne.constants.QSysConstants;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class QNEPaths {

    private final Path userHomePath;
    private final Path qnePath;
    private final Path systemPath;
    private final Path knownPath;
    private final Path endPointsPath;
    private final Path tmpPath;
    private final Path installPath;
    private final Path installSystemPropsFilePath;
    private final Path sysPropsMapFilePath;
    private final Path keystoreFilePath;
    private final Path installerPropsFilePath;
    private final Path repositoryPath;


    public QNEPaths() {
        userHomePath = Paths.get(System.getProperty("user.home"));
        qnePath = Paths.get(userHomePath.toString(), "QNEVaadin");
        systemPath = Paths.get(qnePath.toString(), "system");
        knownPath = Paths.get(systemPath.toString(), "known");
        endPointsPath = Paths.get(systemPath.toString(), "endPoints");
        tmpPath = Paths.get(systemPath.toString(), "tmp");
        repositoryPath = Paths.get(qnePath.toString(), "repository");
        keystoreFilePath = Paths.get(repositoryPath.toString(), "keystore.p12");
        installPath = Paths.get(qnePath.toString(), "install");
        installSystemPropsFilePath = Paths.get(installPath.toString(), "installer.props");
        installerPropsFilePath = Paths.get(System.getProperty("user.home"), QSysConstants.APP_NAME, "install", "installer.props");
        sysPropsMapFilePath = Paths.get(systemPath.toString(), "sysProps.map");
    }

    public Path getEndPointsPath() {
        return endPointsPath;
    }

    public Path getTmpPath() {
        return tmpPath;
    }

//    public Path getKeystoreFilePath() {
//        return null;
//    }

    public Path getSysPropsMapFilePath() {
        return sysPropsMapFilePath;
    }

    public Path getSystemPath() {
        return systemPath;
    }

    public Path getRepositoryPath() {
        return repositoryPath;
    }

    public Path getInstallSystemPropsFilePath() {
        return installSystemPropsFilePath;
    }

    public Path getInstallerPropsFilePath() {
        return installerPropsFilePath;
    }

    public Path getKnownPath() {
        return knownPath;
    }

    public Path getKeystoreFilePath() {
        return keystoreFilePath;
    }

    public Path getInstallPath() {
        return installPath;
    }
}
