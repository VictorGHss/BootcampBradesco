package dio.introducao.controle;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano){
            case "T" : {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram ilimitados");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
//        String plano = "M";
//
//        if (plano == "B") {
//            System.out.println("100 minutos de ligação");
//        } else if (plano == "M") {
//            System.out.println("100 minutos de ligação");
//            System.out.println("Whatsapp e Instagram ilimitados");
//        } else if (plano == "T") {
//            System.out.println("100 minutos de ligação");
//            System.out.println("Whatsapp e Instagram ilimitados");
//            System.out.println("5GB YouTube");
//        }
//    }
//}
