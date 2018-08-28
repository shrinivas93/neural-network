package com.shri.neuralnet.components;

import java.util.List;

import com.shri.neuralnet.functions.loss.LossFunction;

public class NeuralNetwork {

    private String id;

    private Layer inputLayer;

    private List<Layer> hiddenLayers;

    private Layer outputLayer;

    private LossFunction lossFunction;

    public NeuralNetwork() {
    }

    public NeuralNetwork(String id, Layer inputLayer, List<Layer> hiddenLayers, Layer outputLayer,
            LossFunction lossFunction) {
        super();
        this.id = id;
        this.inputLayer = inputLayer;
        this.hiddenLayers = hiddenLayers;
        this.outputLayer = outputLayer;
        this.lossFunction = lossFunction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Layer getInputLayer() {
        return inputLayer;
    }

    public void setInputLayer(Layer inputLayer) {
        this.inputLayer = inputLayer;
    }

    public List<Layer> getHiddenLayers() {
        return hiddenLayers;
    }

    public void setHiddenLayers(List<Layer> hiddenLayers) {
        this.hiddenLayers = hiddenLayers;
    }

    public Layer getOutputLayer() {
        return outputLayer;
    }

    public void setOutputLayer(Layer outputLayer) {
        this.outputLayer = outputLayer;
    }

    public LossFunction getLossFunction() {
        return lossFunction;
    }

    public void setLossFunction(LossFunction lossFunction) {
        this.lossFunction = lossFunction;
    }

    @Override
    public String toString() {
        return "NeuralNetwork [id=" + id + ", inputLayer=" + inputLayer + ", hiddenLayers=" + hiddenLayers
                + ", outputLayer=" + outputLayer + ", lossFunction=" + lossFunction + "]";
    }

}
