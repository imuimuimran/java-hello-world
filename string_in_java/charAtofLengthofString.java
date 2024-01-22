class charAtofLengthofString  {  
    // Concatenation
    public static void main(String[] args)  {      
        String firstName = "Mohd. Imran";
        String lastName = "Hossain";
        String fullName= firstName + " " + lastName;       
        System.out.println(fullName.length());     


        for(int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }  
}  