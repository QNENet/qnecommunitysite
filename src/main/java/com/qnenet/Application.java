package com.qnenet;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.valb3r.letsencrypthelper.tomcat.TomcatWellKnownLetsEncryptChallengeEndpointConfig;
import org.springframework.context.annotation.Import;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
//@Import(TomcatWellKnownLetsEncryptChallengeEndpointConfig.class)
@Theme(value = "qnecommunitysite")
public class Application implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
