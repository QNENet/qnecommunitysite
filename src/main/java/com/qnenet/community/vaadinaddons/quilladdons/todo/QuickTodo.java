//package com.qnenet.community.vaadinaddons.quilladdons.todo;
//
//
//import com.qnenet.qne.mainui.api.classes.QuickItem;
//import com.qnenet.qne.qneapi.classes.QTodoItem;
//import com.qnenet.qne.qneapi.constants.QSystemConstants;
//import com.qnenet.qne.qneapi.intf.QNode;
//import com.qnenet.qne.qneutils.QFileUtils;
//import com.qnenet.qne.qsystem.api.QSystem;
//import com.qnenet.qne.qvaadinutils.composites.QDateTimeInput;
//import com.qnenet.qne.qvaadinutils.composites.QVerticalRadioButtonGroup;
//import com.vaadin.flow.component.dialog.Dialog;
//import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
//import org.osgi.service.component.annotations.Activate;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.Deactivate;
//import org.osgi.service.component.annotations.Reference;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Arrays;
//
//@Component(immediate = true)
//public class QuickTodo implements QuickItem {
//
//    private static final String TODO_DIR = "todo.dir";
//    static Logger log = LoggerFactory.getLogger(QuickTodo.class);
//
//////////////  Custom  //////////////////////////////////////////////////////////////////////////////////////////////////
//
//    @Reference
//    QSystem system;
//
//    @Reference
//    QNode node;
//
//    private Path todoDataPath;
//    private String name = "Todo";
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////// Activate ///////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    /*
//     * Only one segment server per node as the file path does not include segmentId
//     */
//    @Activate
//    public void activate() {
//
//        log.info("Hello from -> " + getClass().getSimpleName());
//    }
//
//
//    @Deactivate
//    public void deactivate() {
//        log.info("Goodbye from -> " + getClass().getSimpleName());
//    }
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
//        todoDataPath = Paths.get(system.getStrSysProp(QSystemConstants.NODE_DIR), "viewsData", "todo");
//        QFileUtils.checkDirectory(todoDataPath.getParent());
//        QTodoItem item = new QTodoItem();
//
////        public String todoItemType; // medical.appointment medical.hospital.admission
////        public long timeEpochSecs;
////        public int durationSecs;
////        public boolean durationIsAccurate;
////        public int contactId;
////        public String location;
////        public String memo;
////        public ArrayList<String> completionStage;
//
//
//
//        Dialog dialog = new Dialog();
//        dialog.setWidth("300px");
//
//        dialog.setModal(true);
//        dialog.setDraggable(true);
//        dialog.setHeaderTitle(name);
//
//        String[] vrbgItems1 = new String[]{"Business", "Personal", "Social"};
//        QVerticalRadioButtonGroup vrbg1 = new QVerticalRadioButtonGroup(Arrays.asList(vrbgItems1));
//        RadioButtonGroup<String> rbg = vrbg1.getRbg();
//        rbg.addValueChangeListener(e -> {
//            item.todoItemType = e.getValue();
//        });
//
//        QDateTimeInput dateTimeInput = new QDateTimeInput();
//
////        VerticalLayout layout = new VerticalLayout();
////        layout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
////        layout.setAlignItems(FlexComponent.Alignment.CENTER);
//
////        ArrayList<ArrayList<String>> arrays = getArrayListsForYear();
////
////        QVerticalRadioButtonGroup rbg = new QVerticalRadioButtonGroup(arrays);
//        dialog.add(vrbg1);
////        RadioButtonGroup rbgDate = new RadioButtonGroup();
////        rbgDate.setItems("Event", "Appointment", "Meeting", "Todo");
////
////        QYearPicker yearPicker = new QYearPicker();
////        HorizontalLayout hLayout = new HorizontalLayout();
////
////
////        layout.add(rbgTodoType, yearPicker);
////
////        Button saveButton = new Button("OK");
////        saveButton.addThemeVariants(ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_PRIMARY);
////        saveButton.addClickListener(click -> {
////            dialog.close();
////        });
////        Button cancelButton = new Button("Cancel");
////        cancelButton.addThemeVariants(ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_ERROR);
////        cancelButton.addClickListener(click -> {
////            dialog.close();
////        });
////
////        dialog.getFooter().add(cancelButton, saveButton);
//        return dialog;
//    }
//
////    private static ArrayList<RadioButtonGroup> getRadioButtonGroupsForYear() {
////        ArrayList<RadioButtonGroup> radioBtnGroups = new ArrayList<>();
////        LocalDateTime now = LocalDateTime.now();
////        int yearNow = now.getYear();
////        int monthNow = now.getMonthValue();
////        int dayNow = now.getDayOfMonth();
////        int hourNow = now.getHour();
////        int minuteNow = now.getMinute();
////
////        boolean leapYear = QDateTimeUtils.isLeapYear(yearNow);
////
////
////        RadioButtonGroup years = new RadioButtonGroup();
////        years.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
////        ArrayList<Integer> yearList = new ArrayList<>(50);
////        int firstYear = yearNow - 25;
////        for (int i = 0; i < 50; i++) {
////            yearList.add(firstYear + i);
////        }
////        years.setItems(yearList);
////        years.setValue(yearNow);
////
////
////        ArrayList<ArrayList<String>> arrays = new ArrayList<>();
////        arrays.add(yearList);
////
////        ArrayList<String> monthList = new ArrayList<>(12);
////        monthList.add("Jan");
////        monthList.add("Feb");
////        monthList.add("Apr");
////        monthList.add("May");
////        monthList.add("Jun");
////        monthList.add("Jul");
////        monthList.add("Aug");
////        monthList.add("Sep");
////        monthList.add("Oct");
////        monthList.add("Nov");
////        monthList.add("Dec");
////        arrays.add(monthList);
////
////        ArrayList<String> dayList = new ArrayList<>(31);
////        for (int i = 1; i < 32; i++) {
////            dayList.add(String.valueOf(i));
////        }
////        arrays.add(dayList);
////
////        ArrayList<String> hourList = new ArrayList<>(24);
////        for (int i = 0; i < 24; i++) {
////            hourList.add(QStringUtils.int2(i));
////        }
////        arrays.add(hourList);
////
////        ArrayList<String> minsList = new ArrayList<>(12);
////        for (int i = 0; i < 24; i += 5) {
////            minsList.add(QStringUtils.int2(i));
////        }
////        arrays.add(minsList);
////        return arrays;
////    }
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//} /////// End Class ////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
