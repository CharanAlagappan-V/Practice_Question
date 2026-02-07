public class PetrolBunkProblem {
    public static void main(String[] args) {
        int petrolInCar = 2;
        int[] distances = {1,5,3};
        int[] capacities = {6,4,2};

        int leftPetrol = calculateMileage(petrolInCar,distances,capacities);

        if(leftPetrol>=0){
            System.out.println(leftPetrol);
        }else{
            System.out.println("out of petrol");
        }
    }

    public static int calculateMileage(int petrolInCar, int[] distances, int[] capacities){
        int currentCapacity = petrolInCar;

        for(int i=0;i<distances.length;i++){
            currentCapacity -= distances[i];

            if(currentCapacity<0){
                return -1;
            }

            currentCapacity += capacities[i];
        }

        return currentCapacity;
    }
}
