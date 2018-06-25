
package telefone;


public class Main {
       
       
    public static void main(String[] args) {
       Telefone t1 =  new Telefone(Telefone.TiposDeTelefone.FAX ,55, 89, 11111111);
       Telefone t2 =  new Telefone(Telefone.TiposDeTelefone.COMERCIAL , 75, 33333333);
       Telefone t3 =  new Telefone(Telefone.TiposDeTelefone.RESIDENCIAL, 22222222);
       Telefone t4 =  new Telefone(11111111);
       
       System.out.println("---------T1---------");
       System.out.println(t1.getCode_DDD());
       System.out.println(t1.getCode_DDI());
       System.out.println(t1.getNumero());
       System.out.println(t1.tipo.getTipo());
       
       System.out.println("---------T2---------");
       System.out.println(t2.getNumero());
       t2.setNumero(66666666);
       System.out.println(t2.getNumero());
       
       System.out.println("----------T3--------");       
       System.out.println(t3.getCode_DDD());
       t3.setCode_DDD(66);
       System.out.println(t3.getCode_DDD());
       
        System.out.println("--------T4----------");
       System.out.println(t4.getCode_DDI());
       t4.setCode_DDI(44);
       System.out.println(t4.getCode_DDI()); 
       System.out.println("---------FIM---------");
       
       
       //tipo do telefone é fixo entao nao pode manipular... com setteres...
       
             
       
            
    }


    
}
