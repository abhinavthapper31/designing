package lowLevelDesign.cacheLLD.policy;

public interface EvictionPolicy<Key> {

    void keyAccessed(Key key);

    Key evict();
}
