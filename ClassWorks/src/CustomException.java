// class AgeNotFound extends Exception{
//     AgeNotFound(){
//         System.out.println("defult");
//     }
//     AgeNotFound(String s){
//         System.out.println("with");
//     }
//     AgeNotFound(Throwable cause){
//         System.out.println("throw");
//     }
//     AgeNotFound(Throwable cause, String s){
//
//     }
//}
//class NotNation extends  RuntimeException{
//    NotNation(){
//        System.out.println("defult");
//    }
//    NotNation(String s){
//        System.out.println("with");
//    }
//    NotNation(Throwable cause){
//        System.out.println("Throw");
//    }
//    NotNation(Throwable cause, String s){
//        System.out.println("throw+String");
//    }
//}
//class Register{
//    public void check(String citizenship, int age) throws AgeNotFound {
//        if(age < 18){
//            throw  new AgeNotFound("not alow");
//        }
//        if (!citizenship.equalsIgnoreCase("Indian")){
//            try {
//                throw new NotNation("Youn not with");
//            }
//            catch (NotNation){
//                System.out.println("Not Indian");
//            }
//        }
//
//    }
//}
//
//public class CustomException {
//    public static void main(String[] args) {
//        Register register = new Register();
//        try {
//            register.check("Indian",18);
//        } catch (AgeNotFound e) {
//            //throw new RuntimeException(e)
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }
//    }
//}
