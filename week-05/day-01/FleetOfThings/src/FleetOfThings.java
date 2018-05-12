public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));
        fleet.add(new Thing("Stand up"));
        fleet.add(new Thing("Eat lunch"));

        fleet.get(2).complete();
        fleet.get(3).complete();

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}