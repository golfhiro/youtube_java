class array {
  public static void main(String[] args) {
    //書き方1
    // String[] arr;                 //データ型のあとに各括弧と配列変数名を記述
    // arr = new String[3];          //newと書いてデータ型、各括弧の中に要素数を指定

    // arr[0] = "sato";
    // arr[1] = "suzuki";
    // arr[2] = "takahashi";

    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // System.out.println(arr[2]);

    // 書き方２
    //データ型[] 配列変数 = {データ１、データ２...};
    String[] arr = {"sato", "suzuki", "takahashi"};

    arr[1] = "tanaka"; //配列[1]の値を変更

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

  }
}
