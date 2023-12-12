//package com.qnenet.community.views.safemail;
//
//
//import com.qnenet.community.classes.QuickItem;
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.button.ButtonVariant;
//import com.vaadin.flow.component.dialog.Dialog;
//import com.vaadin.flow.component.html.H3;
//import com.vaadin.flow.component.orderedlayout.FlexComponent;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
//import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.nio.file.Path;
//import java.util.ArrayList;
//
//
//public class QuickSafeMail implements QuickItem {
//
//    static Logger log = LoggerFactory.getLogger(QuickSafeMail.class);
//
//////////////  Custom  //////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//    private Path safeMailFilePath;
//    private String name = "SafeMail";
//    private ArrayList<VerticalLayout> helpLayouts;
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////// Activate ///////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    /*
//     * Only one segment server per node as the file path does not include segmentId
//     */
////    @Activate
////    public void activate() {
////        safeMailFilePath = Paths.get(system.getStrSysProp(QSystemConstants.SYSTEM_DIR), "safeMail");
////
////        helpLayouts = new ArrayList<>();
////        helpLayouts.add(layout1());
////        helpLayouts.add(layout2());
////
////        log.info("Hello from -> " + getClass().getSimpleName());
////    }
////
////
////    @Deactivate
////    public void deactivate() {
////        log.info("Goodbye from -> " + getClass().getSimpleName());
////    }
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////// New System /////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    private void newSystem() {
//    }
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////// Restart ////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    private void restart() {
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////// Dialog /////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    @Override
//    public Dialog getDialog() {
//        Dialog dialog = new Dialog();
//        dialog.setModal(false);
//        dialog.setDraggable(true);
//        dialog.setHeaderTitle(name);
//        VerticalLayout layout = new VerticalLayout();
//        dialog.add(layout);
//        RadioButtonGroup<String> feelingTypeRBG = new RadioButtonGroup();
//        feelingTypeRBG.setLabel("How Do I Feel?");
//        feelingTypeRBG.setItems("Wellbeing", "Pain");
//
//        RadioButtonGroup<String> oneToTenRBG = new RadioButtonGroup();
//        oneToTenRBG.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
//        feelingTypeRBG.setLabel("Select Level");
//        feelingTypeRBG.setItems("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
//        layout.add(feelingTypeRBG, oneToTenRBG);
//
//        Button saveButton = new Button("OK");
//        saveButton.addThemeVariants(ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_PRIMARY);
//        saveButton.addClickListener(click -> {
////            QFeelingItem feelingItem = new QFeelingItem();
////            feelingItem.timestamp = System.currentTimeMillis();
////            feelingItem.note = textArea.getValue();
////            feelingItem.tags = new ArrayList<>(listBox.getSelectedItems());
////            node.saveObject(feelingItem);
////            quickDialog.close();
//        });
//        Button cancelButton = new Button("Cancel");
//        cancelButton.addThemeVariants(ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_ERROR);
//        cancelButton.addClickListener(click -> {
//            dialog.close();
//        });
//
//        dialog.getFooter().add(cancelButton, saveButton);
//        return dialog;
//    }
//
////    private Button createButton(String text, ButtonVariant variant) {
////        Button btn = new Button(text);
////        btn.addThemeVariants(ButtonVariant.LUMO_SMALL, variant);
////        return btn;
////    }
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////// Help ///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    private VerticalLayout layout1() {
//        VerticalLayout layout = new VerticalLayout();
//        layout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
//        layout.setAlignItems(FlexComponent.Alignment.CENTER);
//        layout.add(new H3("Quick SafeMail help not available"));
//        return layout;
//    }
//
//    private VerticalLayout layout2() {
//        VerticalLayout layout = new VerticalLayout();
//        layout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
//        layout.setAlignItems(FlexComponent.Alignment.CENTER);
//        layout.add(new H3("Still not available"));
//        return layout;
//    }
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//} /////// End Class ////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
