/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.consumoalimentar;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum PerguntaCriancasComMaisDoisAnosEnumThrift implements org.apache.thrift.TEnum {
  VOCE_TEM_COSTUME_DE_REALIZAR_AS_REFEICOES_ASSISTINDO_TV_MEXENDO_NO_COMPUTADOR_E_OU_CELULAR(11),
  QUAIS_REFEICOES_VOCE_FAZ_AO_LONGO_DO_DIA(12),
  FEIJAO(14),
  FRUTAS_FRESCAS(15),
  VERDURAS_E_OU_LEGUMES(16),
  HAMBURGUER_E_OU_EMBUTIDOS(17),
  BEBIDAS_ADOCADAS(18),
  MACARRAO_INSTANTANEO_SALGADINHOS_BISCOITOS(19),
  BISCOITO_RECHEADO_DOCES_OU_GULOSEIMAS(20);

  private final int value;

  private PerguntaCriancasComMaisDoisAnosEnumThrift(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PerguntaCriancasComMaisDoisAnosEnumThrift findByValue(int value) { 
    switch (value) {
      case 11:
        return VOCE_TEM_COSTUME_DE_REALIZAR_AS_REFEICOES_ASSISTINDO_TV_MEXENDO_NO_COMPUTADOR_E_OU_CELULAR;
      case 12:
        return QUAIS_REFEICOES_VOCE_FAZ_AO_LONGO_DO_DIA;
      case 14:
        return FEIJAO;
      case 15:
        return FRUTAS_FRESCAS;
      case 16:
        return VERDURAS_E_OU_LEGUMES;
      case 17:
        return HAMBURGUER_E_OU_EMBUTIDOS;
      case 18:
        return BEBIDAS_ADOCADAS;
      case 19:
        return MACARRAO_INSTANTANEO_SALGADINHOS_BISCOITOS;
      case 20:
        return BISCOITO_RECHEADO_DOCES_OU_GULOSEIMAS;
      default:
        return null;
    }
  }
}
