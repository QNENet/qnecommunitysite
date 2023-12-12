///*
// * Copyright 2000-2020 Vaadin Ltd.
// *
// * Licensed under the Apache License, Version 2.0 (the "License"); you may not
// * use this file except in compliance with the License. You may obtain a copy of
// * the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
// * License for the specific language governing permissions and limitations under
// * the License.
// */
//package com.qnenet.community.views.passwords;
//
//
//import com.qnenet.community.constants.QRoutes;
//import com.qnenet.community.viewsmain.ContentLayout;
//import com.vaadin.flow.component.html.H1;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.router.*;
//import jakarta.annotation.security.PermitAll;
//
//import java.io.IOException;
//
//@PermitAll
//@Route(value = QRoutes.PASSWORDS, layout = ContentLayout.class)
//@PageTitle("Passwords")
//public class QViewPasswords extends VerticalLayout implements BeforeEnterObserver, BeforeLeaveObserver {
//
////    private final QSessionInfo sessionInfo;
//
//    public QViewPasswords() throws IOException {
////        sessionInfo = (QSessionInfo) VaadinSession.getCurrent().getAttribute(QSysConstants.SESSION_INFO);
////        sessionInfo.node.newSystem();
//
//        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
//        add(new H1("Passwords"));
//
//    }
//
//    public void beforeEnter(BeforeEnterEvent event) {
//        System.out.println("Passwords View BeforeEnter");
//    }
//
//    @Override
//    public void beforeLeave(BeforeLeaveEvent event) {
//        System.out.println("Passwords View BeforeLeaveEvent");
//    }
//
//
//}
