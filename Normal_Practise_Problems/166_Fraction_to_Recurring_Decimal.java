class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";

        StringBuilder sb = new StringBuilder();
        if((numerator<0 && denominator>0) || (numerator>0 && denominator<0)){
            sb.append("-");
        }

        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);

        long remainder = num%denom;
        sb.append(num/denom);

        if(remainder == 0){
            return sb.toString();
        }

        sb.append(".");
        HashMap<Long, Integer> hashMap = new HashMap<>();

        while(remainder!=0){
            if(hashMap.containsKey(remainder)){
                sb.insert(hashMap.get(remainder), "(");
                sb.append(")");
                break;
            }
            hashMap.put(remainder, sb.length());

            remainder = remainder * 10;
            sb.append(remainder/denom);
            remainder = remainder%denom;
        }
        return sb.toString();
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
