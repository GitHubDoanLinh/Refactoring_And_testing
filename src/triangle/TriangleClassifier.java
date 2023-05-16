package triangle;

public class TriangleClassifier {
    public static final String TAM_GIAC_DEU = "Tam Giac Deu";
    public static final String TAMGIACCAN = "Tam Giac Can";
    public static final String TAMGIACTHUONG = "Tam Giac Thuong";
    public static final String NOTATRIANGLE = "Khong Phai Tam Giac";



    public static String classify(int a, int b, int c){
        if(a==b && b==c &&(a+b>c && b+c>a && a+c>b) && (a>0 && b>0 && c>0))
            return TAM_GIAC_DEU;
        if((a==b || a==c || b==c) && (a+b>c && b+c>a && a+c>b) && (a>0 && b>0 && c>0))
            return TAMGIACCAN;
        if(a!=b && b!=c && c!=a && (a+b>c && b+c>a && a+c>b) && (a>0 && b>0 && c>0)){
            return TAMGIACTHUONG;
        }
        if((a+b<c || b+c<a || a+c<b) && (a<=0 || b<=0 || c<=0)){
            return NOTATRIANGLE;
        }
        return NOTATRIANGLE;
    }



}
