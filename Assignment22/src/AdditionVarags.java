 class AdditionVarags {
     public static int add(int... numbers) {
         int sum = 0;
         for (int i : numbers) {
             sum += i;
         }
         return sum;
     }

 }
