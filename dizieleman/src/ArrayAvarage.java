public class ArrayAvarage {

        public static void main(String[] args) {

            double[] numbers = {1, 2, 3, 4, 5};
            double harmonik=0;
            for (int i = 0; i < numbers.length; i++){
                harmonik += 1/numbers[i];
                System.out.println(harmonik);
            }
            System.out.println("harmonik seri :"+harmonik);
            double harmonikOrt= 0;
            for (int i = 0; i < numbers.length; i++) {
                harmonikOrt = numbers.length/harmonik;
            }

            System.out.println(harmonikOrt);
        }
    }
    
