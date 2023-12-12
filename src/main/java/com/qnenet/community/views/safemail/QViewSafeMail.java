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
//package com.qnenet.community.views.safemail;
//
//import com.qnenet.community.constants.QRoutes;
//import com.qnenet.community.viewsmain.ContentLayout;
//import com.vaadin.flow.component.html.H1;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.router.*;
//
//import java.io.IOException;
//
//@Route(value = QRoutes.SAFE_MAIL, layout = ContentLayout.class)
//@PageTitle("SafeMail")
//public class QViewSafeMail extends VerticalLayout implements BeforeEnterObserver, BeforeLeaveObserver {
//
////    private final QSessionInfo sessionInfo;
//
//    public QViewSafeMail() throws IOException {
////        sessionInfo = (QSessionInfo) VaadinSession.getCurrent().getAttribute(QSystemConstants.SESSION_INFO);
////        sessionInfo.node.newSystem();
//
//        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
//        add(new H1("SafeMail"));
//
//    }
//
//    public void beforeEnter(BeforeEnterEvent event) {
//        System.out.println("SafeMail View BeforeEnter");
//    }
//
//    @Override
//    public void beforeLeave(BeforeLeaveEvent event) {
//        System.out.println("SafeMail View BeforeLeaveEvent");
//    }
//
//
////    @Override
////    public Registration addAttachListener(ComponentEventListener<AttachEvent> listener) {
////        return super.addAttachListener(listener);
////    }
//
//}
