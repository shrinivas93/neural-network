package com.shri.neuralnet.components;

public class Connection {

    private Neuron fromNeuron;

    private Neuron toNeuron;

    public Connection() {
    }

    public Connection(Neuron fromNeuron, Neuron toNeuron) {
        super();
        this.fromNeuron = fromNeuron;
        this.toNeuron = toNeuron;
    }

    public Neuron getFromNeuron() {
        return fromNeuron;
    }

    public void setFromNeuron(Neuron fromNeuron) {
        this.fromNeuron = fromNeuron;
    }

    public Neuron getToNeuron() {
        return toNeuron;
    }

    public void setToNeuron(Neuron toNeuron) {
        this.toNeuron = toNeuron;
    }

    public Double getWeightedInput() {
        return this.fromNeuron.calculateWeightedOutput();
    }

    @Override
    public String toString() {
        return "Connection [fromNeuron=" + fromNeuron + ", toNeuron=" + toNeuron + "]";
    }

}
