package org.openbaton.tosca.templates.TopologyTemplate.Nodes.VNF;

import org.openbaton.catalogue.mano.common.VNFDeploymentFlavour;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by rvl on 19.08.16.
 */
public class VNFProperties {

    private String vendor;
    private String ID;
    private double version;
    private String vnfPackageLocation;
    private ArrayList<String> deploymentFlavour;
    private VNFConfigurations configurations = null;

    public VNFProperties(Object properties){

        Map<String, Object> propertiesMap = (Map<String, Object>) properties;

        if(propertiesMap.containsKey("vendor")){
            vendor = (String) propertiesMap.get("vendor");
        }

        if(propertiesMap.containsKey("version")){
            version = (double) propertiesMap.get("version");
        }

        if(propertiesMap.containsKey("vnfPackageLocation")){
            vnfPackageLocation = (String) propertiesMap.get("vnfPackageLocation");
        }

        if(propertiesMap.containsKey("deploymentFlavour")){
            deploymentFlavour = (ArrayList<String>) propertiesMap.get("deploymentFlavour");
        }

        if(propertiesMap.containsKey("ID")){
            ID = (String) propertiesMap.get("ID");
        }

        if( propertiesMap.containsKey("configurations")){
            configurations = new VNFConfigurations(propertiesMap.get("configurations"));
        }
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getVnfPackageLocation() {
        return vnfPackageLocation;
    }

    public void setVnfPackageLocation(String vnfPackageLocation) {
        this.vnfPackageLocation = vnfPackageLocation;
    }

    public ArrayList<String> getDeploymentFlavour() {
        return deploymentFlavour;
    }

    public void setDeploymentFlavour(ArrayList<String> deploymentFlavour) {
        this.deploymentFlavour = deploymentFlavour;
    }

    public Set<VNFDeploymentFlavour> getDeploymentFlavourConverted(){

        Set<VNFDeploymentFlavour> vnfdf = new HashSet<>();

        if(deploymentFlavour != null){
            for(String df : deploymentFlavour){

                VNFDeploymentFlavour new_df = new VNFDeploymentFlavour();
                new_df.setFlavour_key(df);
                vnfdf.add(new_df);
            }
        }

        return vnfdf;
    }

    public VNFConfigurations getConfigurations() {
        return configurations;
    }

    public void setConfigurations(VNFConfigurations configurations) {
        this.configurations = configurations;
    }

    @Override
    public String toString(){

        return "VNFP : " + "\n" +
                "id : " + getID() + "\n" +
                "vendor : " + vendor + "\n" +
                "version : " + version + "\n" +
                "package : " + vnfPackageLocation + "\n" +
                "depl flavour : " + deploymentFlavour + "\n";
    }
}