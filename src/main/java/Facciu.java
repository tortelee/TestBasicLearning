public class Facciu {

    private static int i=0;    public static int faa(int a) throws Exception {
        if(a<1 || a>46){
            throw new Exception("超过边界");
        }
        if(a==1){
            return 1;
        }
        if(a==2){
            return 2;
        }
        return faa(a-1)+faa(a-2);
    }
}
