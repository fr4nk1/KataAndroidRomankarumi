package idealista.katatestromano;


import java.util.HashMap;

class ArabicToRomanCalculator {

    private HashMap<Integer, String> hashMap = new HashMap<>();


    public String calculate(int number){

        hashMap.put(1, "I");
        hashMap.put(4, "IV");
        hashMap.put(5, "V");

        String dev = hashMap.get(number);
        if(dev==null){
            if(number>5){
                dev = hashMap.get(5) + hashMap.get(number-5);
            }
            else if(number>1){
                dev = hashMap.get(1) + hashMap.get(number-1);
            }
            else
                return "";
        }

        return dev;
    }
}
