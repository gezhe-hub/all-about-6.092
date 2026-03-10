public class Marathon {
  public static void main (String[] arguments) {
    String[] names = {
      "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
      "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
      "Aaron", "Kate"
      };

    int[] times = {
      341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
      343, 317, 265
      };

    // 你的任务 1: 调用方法找出第一名的索引
    int fastestIndex = getFastestIndex(times);

    // 打印第一名
    System.out.println("第一名是: " + names[fastestIndex] + "，耗时: " + times[fastestIndex] + " 分钟");

    // 你的任务 2 (挑战): 找出第二名的索引并打印
    int secondIndex = getSecondFastestIndex(times);
    System.out.println("The second: " + names[secondIndex] + "(" + times[secondIndex] + "minutes)");
  }

  // 你的逻辑实现区
  public static int getFastestIndex(int[] times) {
    int minIndex = 0;
    for (int i = 1; i < times.length ; i++) {
      if( times[i] < times[minIndex]) {
        minIndex = i;
      }
  }
    return minIndex;
  }
  public static int getSecondFastestIndex(int[] times) {
    int first = 0;
    int second = 0;
    if ( times[1] < times[0]) {
      first = 1;
      second = 0;
    }else {
      first = 0;
      second = 1;
    }
    for (int i = 2 ; i < times.length ; i++) {
      if ( times[i] < times[first]) {
        second = first;
        first = i;
      }
      else if (times[i] < times[second]) {
        second = i;
      }
    }
    return second;
  }
}
