/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciobanco;

/**
 *
 * @author Felipe
 */
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos
    
    // Construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
        
    }
    
    // Métodos criados
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        
        if (this.tipo.equals("CC")) {           
            this.saldo = 50;
        } else if (this.tipo.equals("CP")) {
            this.saldo = 150;
        } else {
            System.out.println("Tipo de conta inválido!");
        }
        System.out.println("Conta Aberta!");
    }
    
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }
    
    public void depositar(float v) {
        if (getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Impossível depositar");
        }
    }
    
    public void sacar(float va) {
        if (getStatus() == true) {
            if (this.saldo >= va) {
                setSaldo(getSaldo() - va);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo Insuficiente para saque!");
            }
        } else {
            System.out.println("Impossíivel sacar!");
        }
    }
    
    public void pagarMensal() {
        float v = 0;
        
        if (this.getTipo().equals("CC")) {           
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        
        if (getStatus() == true) {
            if (this.saldo >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso pelo " + getDono());
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Impossíivel pagar Mensal!");
        }
    }
    
    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int nC) {
        this.numConta = nC;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public void setDono(String don) {
        this.dono = don;
    }

    public void setSaldo(float sald) {
        this.saldo = sald;
    }

    public void setStatus(boolean sta) {
        this.status = sta;
    }
    
    public void statusDaConta() {
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }
}
