package ThucHanh;

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] s1, String[] s2) {
        StringBuilder res1  = new StringBuilder();
        StringBuilder res2 = new StringBuilder();

        for(String s : s1) {
            res1.append(s);
        }

        for(String s : s2) {
            res2.append(s);
        }
        
        return (res1.toString()).equals(res2.toString());
    }
}
