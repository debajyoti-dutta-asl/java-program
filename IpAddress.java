
public class IpAddress {
    int ip1,ip2,ip3,ip4;

    public IpAddress(String s){
        String [] result = s.split("\\.");
        ip1= Integer.parseInt(result[0]);
        ip2= Integer.parseInt(result[1]);
        ip3= Integer.parseInt(result[2]);
        ip4= Integer.parseInt(result[3]);

    }

    public Boolean validIp(){
        if(ip1>=0 && ip1 <=255){
            if(ip2>=0 && ip2<=255){
                if(ip3>=0 && ip3<=255){
                    if(ip4>=0 && ip4<=255){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
