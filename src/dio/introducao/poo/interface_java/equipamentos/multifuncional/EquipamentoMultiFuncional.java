package dio.introducao.poo.interface_java.equipamentos.multifuncional;

import dio.introducao.poo.interface_java.equipamentos.copiadora.Copiadora;
import dio.introducao.poo.interface_java.equipamentos.digitalizadora.Digitalizadora;
import dio.introducao.poo.interface_java.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}
