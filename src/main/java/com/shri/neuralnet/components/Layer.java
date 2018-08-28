package com.shri.neuralnet.components;

import java.util.List;

public class Layer {

    private Long layerNumber;

    private List<Neuron> nodes;

    public Layer() {
    }

    public Layer(Long layerNumber, List<Neuron> nodes) {
        super();
        this.layerNumber = layerNumber;
        this.nodes = nodes;
    }

    public Long getLayerNumber() {
        return layerNumber;
    }

    public void setLayerNumber(Long layerNumber) {
        this.layerNumber = layerNumber;
    }

    public List<Neuron> getNodes() {
        return nodes;
    }

    public void setNodes(List<Neuron> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "Layer [layerNumber=" + layerNumber + ", nodes=" + nodes + "]";
    }

}
