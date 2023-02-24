Collections.sort(
    animals,
    new Comparator<String>() {
      @Override
      public int compare(String x, String y) {
        return x.compareTo(y);
      }
    });