package com.shri.neuralnet.components;

import java.util.List;

import com.shri.neuralnet.functions.activation.ActivationFunction;
import com.shri.neuralnet.functions.summing.InputSummingFunction;

public class Neuron {

    private List<Connection> inputConnections;

    private List<Connection> outputConnections;

    private Double weight;

    private Double bias;

    private InputSummingFunction inputSummingFunction;

    private ActivationFunction activationFunction;

    public Neuron() {
    }

    public Neuron(List<Connection> inputConnections, List<Connection> outputConnections, Double weight, Double bias,
            InputSummingFunction inputSummingFunction, ActivationFunction activationFunction) {
        super();
        this.inputConnections = inputConnections;
        this.outputConnections = outputConnections;
        this.weight = weight;
        this.bias = bias;
        this.inputSummingFunction = inputSummingFunction;
        this.activationFunction = activationFunction;
    }

    public List<Connection> getInputConnections() {
        return inputConnections;
    }

    public void setInputConnections(List<Connection> inputConnections) {
        this.inputConnections = inputConnections;
    }

    public List<Connection> getOutputConnections() {
        return outputConnections;
    }

    public void setOutputConnections(List<Connection> outputConnections) {
        this.outputConnections = outputConnections;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBias() {
        return bias;
    }

    public void setBias(Double bias) {
        this.bias = bias;
    }

    public InputSummingFunction getInputSummingFunction() {
        return inputSummingFunction;
    }

    public void setInputSummingFunction(InputSummingFunction inputSummingFunction) {
        this.inputSummingFunction = inputSummingFunction;
    }

    public ActivationFunction getActivationFunction() {
        return activationFunction;
    }

    public void setActivationFunction(ActivationFunction activationFunction) {
        this.activationFunction = activationFunction;
    }

    @Override
    public String toString() {
        return "Neuron [inputConnections=" + inputConnections + ", outputConnections=" + outputConnections + ", weight="
                + weight + ", bias=" + bias + ", inputSummingFunction=" + inputSummingFunction + ", activationFunction="
                + activationFunction + "]";
    }

    public Double calculateWeightedOutput() {
        Double totalInput = this.inputSummingFunction.calculate(this.inputConnections);
        return this.activationFunction.calculate(totalInput) * this.weight + this.bias;
    }

}
