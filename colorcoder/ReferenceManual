package colorcoder;

public class ReferenceManual {

    public String toString(){
        
      ColorService service = new ColorService();
      String refManual="The Referance Manual: \n";
    	for(int i=1; i<26; i++) {
            String colorPairStr = service.getColorFromPairNumber(i).ToString();
            refManual += i +" = "+ colorPairStr+"\n";
    	}
    	return refManual;
    }
}
