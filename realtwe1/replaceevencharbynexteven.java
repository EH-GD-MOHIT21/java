public class replaceevencharbynexteven {
    public static void main(String[] args) {
        String s = "smvdu";
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        String result = "";
        for(int i=0;i<s.length();i++){
            if(i%2==1){
                try{
                    result = result.concat(String.valueOf(arr[i+2]));
                }catch(Exception e){
                    result = result.concat(String.valueOf("1"));
                }
            }else{
                result = result.concat(String.valueOf(arr[i]));
            }
        }
        System.out.println(result);
    }
}