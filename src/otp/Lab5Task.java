package otp;

public class Lab5Task {
    /**
     * Create a program in Java to create OTP (One-Time Passwords) for a customer service.
     */
        private static final byte RANDOM_NUMBER_MAX_LIMIT = 10;

        /**
         * This method generates an OTP for the customer depending upon the number of digits.
         *
         * @return the generated OTP.
         */
        private static int generateOTP() {
            // TODO create an `int` variable to store the number of digits in OTP and set it to 6.
            int digit=6;

            // TODO create an `int` variable to store the one time password and set it to 0.
            int otp=1;

            // TODO create a for loop, start it from 0 and run it one time less than the number of digits in otp.
            for (int i=0;i<digit ;i++ ) {
            // TODO create an `int` variable to store a random number and set it to 0.
            int randomNumber=0;
            // TODO call the createRandomNumber method and set the result in the random number variable.
             randomNumber = createRandomNumber();
            // TODO create an integer variable to store powers of 10
            //  initialize it with 10 ^ i (loop control variable), use Math.pow(10.0, i);
            //  Don't forget to add explicit type cast.
                int number;
                if(randomNumber!=0){
                number = (int)Math.pow(10,i);

            // TODO multiply the random number variable with powers Of 10 variable and store the result back to
            //  powers of 10 variable.

            number=number*randomNumber;
            otp=number+otp;
                }
                else
                    otp=otp*10;

            // TODO add the one time password variable to the powers of 10 variable and store it back to one time
            //  password variable.


            }
            return otp;
        }

        /**
         * This method generates a random number between 0 and 9 for the OTP.
         *
         * @return a random number between 0 and 9.
         */
        private static int createRandomNumber() {
            return (int) (Math.random() * RANDOM_NUMBER_MAX_LIMIT);
        }

        /**
         * This method prints the generated OTP with some dashes between the characters.
         *
         * @param generatedOTP the random OTP generated from the generateOTP method.
         */
        private static void printOTP(int generatedOTP) {
            String otpString = String.valueOf(generatedOTP);
            for (int i = 0; i < otpString.length(); i++) {
                System.out.print(otpString.charAt(i) + (i < otpString.length() - 1 ? "-" : ""));
            }
        }

        public static void main(String[] args) {
            int generatedOTP = generateOTP();
            System.out.print("Your OTP is : ");
            printOTP(generatedOTP);
        }
}
