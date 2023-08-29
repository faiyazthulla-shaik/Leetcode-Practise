class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long lMass = mass;
        Arrays.sort(asteroids);
        for(int i=0; i<asteroids.length; i++){
            long lAsteroid = asteroids[i];
            if(lAsteroid <= lMass){
                lMass = lMass+lAsteroid;
            }else{
                return false;
            }
        }
        return true; 
    }
}

//Time complexity: O(nlogn)
