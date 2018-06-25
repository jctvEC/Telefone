package telefone;


public class Telefone {
  
//  private String tipo;
  private int code_DDI;
  private int code_DDD;
  private int numero;
  TiposDeTelefone tipo;
  
       
  //Atencao:
  // aos construtores que faltam com os seguintes valores padrão: 
  //Celular para o tipo do telefone, 
  //55 para o código DDI e
  //81 para o código DDD.
  
    //Construtores
    
    public Telefone(TiposDeTelefone tipo, int code_DDI, int code_DDD, int numero) {
        //o primeiro deve receber como parâmetro o tipo do telefone, os códigos DDI
        //e DDD e o número do telefone;
        //this.tipo = tipo;
        this.tipo = tipo;
        this.code_DDI = code_DDI;
        this.code_DDD = code_DDD;
        this.numero = numero;
    }
    
    public Telefone(TiposDeTelefone tipo, int code_DDD, int numero) {
        //o segundo deve receber os mesmos parâmetros do primeiro construtor, exceto o código DDI;
       this(tipo, 55, code_DDD, numero);
    }
     
    public Telefone(TiposDeTelefone tipo, int numero) {
       //o terceiro deve receber os mesmos parâmetros do segundo construtor, exceto o código DDD;
         this(tipo, 55, 81, numero);
    }
    
    public Telefone(int numero) {
        //o quarto, e último, deve receber apenas como parâmetro o número do telefone.
        this(TiposDeTelefone.CELULAR, 55, 81, numero);
    }
     
     //metodos
    
    public int getCode_DDI() {
        return this.code_DDI;
    }

    public void setCode_DDI(int code_DDI) {
        this.code_DDI = code_DDI;
    }

    public int getCode_DDD() {
        return this.code_DDD;
    }

    public void setCode_DDD(int code_DDD) {
        this.code_DDD = code_DDD;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    
    //Defina, também, um tipo enumerável TipoTelefone que represente os 4 possíveis tipos de telefone já mencionados acima.
    public enum TiposDeTelefone {
        
        CELULAR("Celular"), FAX("Fax"), COMERCIAL("Comercial"), RESIDENCIAL("Residencial");
        private final String tipo;
        
        TiposDeTelefone(String tipo) {
            this.tipo = tipo;
        }
        
        public String getTipo(){
            return this.tipo;
         }
    }
}

