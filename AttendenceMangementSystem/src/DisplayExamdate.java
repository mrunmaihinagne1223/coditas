public class DisplayExamdate extends CheckAvailbilty implements Runnable {
    int serialno[] = {1,2,3};
    String subject []={"C++","Java","Python"};

    String dates[] = {"1/01/23","2/01/23","3/01/23"};

     public void run() {
         if (falge1) {
             System.out.println("***************DisplayExamSchedule***********************");
             for (int i = 0; i < subject.length; i++) {
                 System.out.println(i + 1 + ":      " + subject[i] + ":      " + dates[i]);
             }
         }
     }
}
