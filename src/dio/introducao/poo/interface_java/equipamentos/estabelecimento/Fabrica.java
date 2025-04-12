package dio.introducao.poo.interface_java.equipamentos.estabelecimento;

import dio.introducao.poo.interface_java.equipamentos.copiadora.Copiadora;
import dio.introducao.poo.interface_java.equipamentos.digitalizadora.Digitalizadora;
import dio.introducao.poo.interface_java.equipamentos.impressora.DeskJet;
import dio.introducao.poo.interface_java.equipamentos.impressora.Impressora;
import dio.introducao.poo.interface_java.equipamentos.impressora.LaserJet;
import dio.introducao.poo.interface_java.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora imp1 = new DeskJet();
        Impressora imp2 = new LaserJet();
        Impressora imp3 = em;
        Copiadora copy1 = em;
        Digitalizadora dig1 = em;

        imp1.imprimir();
        imp3.imprimir();
        dig1.digitalizar();
        copy1.copiar();

    }
}
