package com.github.Eddyosos.integracao20171.esus.cds.procedimento;

import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoChildThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.procedimento.IFichaProcedimentoChild;
import java.util.Iterator;
import java.util.List;

public class FichaProcedimentoChild implements IFichaProcedimentoChild {
    private FichaProcedimentoChildThrift instancia;
    
    public FichaProcedimentoChild(){
        instancia = new FichaProcedimentoChildThrift();
    }
    
    /**
     * Retorna uma instancia nao thrift
     * @param fichaProcedimentoChildThrift 
     */
    public FichaProcedimentoChild(FichaProcedimentoChildThrift fichaProcedimentoChildThrift) {
        this.instancia = fichaProcedimentoChildThrift;
    }
    
    /**
     * @return Objeto thrift para acesso aos metodos do thrift
     * @param fichaProcedimentoChildThrift 
     */
    @Override
    public FichaProcedimentoChildThrift getInstance(){
        return this.instancia;
    }

    /**
     * Retorna o numero de prontuario
     * @return String
     */
    @Override
    public String getNumProntuario() {
        return instancia.getNumProntuario();
    }
    
    /**
     * Atribui o numero de prontuario
     * @param String 
     */
    @Override
    public void setNumProntuario(String numProntuario) {
        instancia.setNumProntuario(numProntuario);
    }
    
    /**
     * Verfica se o numero de prontuario foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumProntuario() {
        return instancia.isSetNumProntuario();
    }
    
    /**
     * Marca que o numero de prontuario foi setado
     * @param value 
     */
    @Override
    public void setNumProntuarioIsSet(boolean value) {
        instancia.setNumProntuarioIsSet(value);
    }
    
    /**
     * Retorna o numero do cartao sus
     * @return String
     */
    @Override
    public String getNumCartaoSus() {
        return instancia.getNumCartaoSus();
    }

    /**
     * Atribui o numero de prontuario
     * @param String 
     */
    @Override
    public void setNumCartaoSus(String numCartaoSus) {
        instancia.setNumCartaoSus(numCartaoSus);
    }

    /**
     * Verfica se o numero do cartao foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumCartaoSus() {
        return instancia.isSetNumCartaoSus();
    }

    /**
     * Marca que o atributo foi setado
     * @param value 
     */
    @Override
    public void setNumCartaoSusIsSet(boolean value) {
        instancia.setNumCartaoSusIsSet(value);
    }
    
    /**
     * Retorna o valor do atributo
     * @return long
     */
    @Override
    public long getDtNascimento() {
        return instancia.getDtNascimento();
    }

    /**
     * Atribui o valor do atributo
     * @param data de nascimento 
     */
    @Override
    public void setDtNascimento(long dtNascimento) {
        instancia.setDtNascimento(dtNascimento);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetDtNascimento() {
        return instancia.isSetDtNascimento();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setDtNascimentoIsSet(boolean value) {
        instancia.setDtNascimentoIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getSexo() {
        return instancia.getSexo();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setSexo(long sexo) {
        instancia.setSexo(sexo);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetSexo() {
        return instancia.isSetSexo();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setSexoIsSet(boolean value) {
        instancia.setSexoIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getLocalAtendimento() {
        return instancia.getLocalAtendimento();
    }
    
    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setLocalAtendimento(long localAtendimento) {
        instancia.setLocalAtendimento(localAtendimento);
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetLocalAtendimento() {
        return instancia.isSetLocalAtendimento();
    }
    
    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setLocalAtendimentoIsSet(boolean value) {
        instancia.setLocalAtendimentoIsSet(value);
    }
    
    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getTurno() {
        return instancia.getTurno();
    }
    
    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setTurno(long turno) {
        instancia.setTurno(turno);
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetTurno() {
        return instancia.isSetTurno();
    }
    
    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setTurnoIsSet(boolean value) {
        instancia.setTurnoIsSet(value);
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isStatusEscutaInicialOrientacao() {
        return instancia.isStatusEscutaInicialOrientacao();
    }
    
    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setStatusEscutaInicialOrientacao(boolean statusEscutaInicialOrientacao) {
        instancia.setStatusEscutaInicialOrientacao(statusEscutaInicialOrientacao);
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */

    @Override
    public boolean isSetStatusEscutaInicialOrientacao() {
        return instancia.isSetStatusEscutaInicialOrientacao();
    }
    
    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setStatusEscutaInicialOrientacaoIsSet(boolean value) {
        instancia.setStatusEscutaInicialOrientacaoIsSet(value);
    }
    
    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public int getProcedimentosSize() {
        return instancia.getProcedimentosSize();
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public Iterator<String> getProcedimentosIterator() {
        return instancia.getProcedimentosIterator();
    }
    
    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public void addToProcedimentos(String elem) {
        instancia.addToProcedimentos(elem);
    }
    
    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public List<String> getProcedimentos() {
        return instancia.getProcedimentos();
    }
    
    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setProcedimentos(List<String> procedimentos) {
        instancia.setProcedimentos(procedimentos);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetProcedimentos() {
        return instancia.isSetProcedimentos();
    }
    
    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setProcedimentosIsSet(boolean value) {
        instancia.setProcedimentosIsSet(value);
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public int getOutrosSiaProcedimentosSize() {
        return instancia.getOutrosSiaProcedimentosSize();
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public Iterator<String> getOutrosSiaProcedimentosIterator() {
        return instancia.getOutrosSiaProcedimentosIterator();
    }
    
    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void addToOutrosSiaProcedimentos(String elem) {
        instancia.addToOutrosSiaProcedimentos(elem);
    }
    
    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public List<String> getOutrosSiaProcedimentos() {
        return instancia.getOutrosSiaProcedimentos();
    }
    
    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setOutrosSiaProcedimentos(List<String> outrosSiaProcedimentos) {
        instancia.setOutrosSiaProcedimentos(outrosSiaProcedimentos);
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetOutrosSiaProcedimentos() {
        return instancia.isSetOutrosSiaProcedimentos();
    }
    
    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setOutrosSiaProcedimentosIsSet(boolean value) {
        instancia.setOutrosSiaProcedimentosIsSet(value);
    }

    /**
     * Valida todos os campos.
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validate(){
        return this.validateGroup() &&
               this.validateLocalAtendimento() &&
               this.validateNumCartaoSus() &&
               this.validateSexo() &&
               this.validateStatusEscutaInicialOrientacao() &&
               this.validateTurno() &&
               this.validateUuidFicha();
    }
    
    /**
     * Número do prontuário do cidadão na UBS.
     * Opcional
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateUuidFicha(){
        if(this.getNumProntuario() == null){
            return true;
        }
        
        if(this.getNumProntuario().length() < 0 || this.getNumProntuario().length() > 30){
            return false;
        }
    
        return true;
    }
    
    /**
     * Numero do cartão SUS do cidadão.
     * Opcional
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateNumCartaoSus(){
        if(this.instancia.getNumCartaoSus() == null){
            return true;
        }
        
        if(!this.instancia.isSetNumCartaoSus()){
            return true;
        }
        
        if(this.instancia.getNumCartaoSus().length() != 15){
            return false;
        }
    
        return true;
    }
    
    /**
     * Código do sexo do cidadão.
     * Obrigatorio
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateSexo(){        
        if(!this.instancia.isSetSexo()){
            return false;
        }
        
        if(this.instancia.getSexo() > 1 || this.instancia.getSexo() < 0){
            return false;
        }
    
        return true;
    }
    
    /**
     * Código do local onde o atendimento foi realizado.
     * Obrigatorio
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateLocalAtendimento(){
        if(!this.instancia.isSetLocalAtendimento()){
            return false;
        }
        
        if(this.instancia.getLocalAtendimento()> 10 || this.instancia.getLocalAtendimento() < 1){
            return false;
        }
    
        return true;
    }
    
     /**
     * Código do turno onde aconteceu o atendimento.
     * Opcional
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateTurno(){
        if(!this.instancia.isSetTurno()){
            return false;
        }
        
        if(this.instancia.getTurno()> 10 || this.instancia.getTurno() < 1){
            return false;
        }
    
        return true;
    }
    
    /**
     * Indica a realização da escuta inicial.
     * Opcional
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateStatusEscutaInicialOrientacao(){
        if(!this.instancia.isSetStatusEscutaInicialOrientacao()){
            return true;
        }
    
        return true;
    }
    
    /**
     * Lista dos códigos dos procedimentos que são registrados na ficha de procedimentos.
     * Condicional
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateProcedimentos(){
        if(!this.instancia.isSetProcedimentos()){
            return false;
        }
        
        if(this.instancia.getProcedimentos().size() < 0 || this.instancia.getProcedimentos().size() > 23){
            return false;
        }
    
        return true;
    }
    
    /**
     * Lista dos códigos dos procedimentos que são registrados na ficha de procedimentos.
     * Condicional
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateOutrosSiaProcedimentos(){
        if(!this.instancia.isSetProcedimentos()){
            return false;
        }
        
        if(this.instancia.getOutrosSiaProcedimentos().size() < 0 || this.instancia.getOutrosSiaProcedimentos().size() > 6){
            return false;
        }
        
        for(String proc : this.instancia.getOutrosSiaProcedimentos()){
            if(proc.matches("\\A\\w{8}\\z")){
                return false;
            }
        }
    
        return true;
    }
    
    /**
     * Valida os campos com preenchimento condicional.
     * @return True caso ao menos um dos campos esteja válido, false caso todos estejam inválidos
     */
    @Override
    public boolean validateGroup(){
        return this.validateProcedimentos()            || 
               this.validateOutrosSiaProcedimentos();
    }
}

