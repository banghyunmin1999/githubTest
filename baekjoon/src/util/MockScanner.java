package util;

/**
 * 테스트 데이터를 이용해 Scanner처럼 동작하는 클래스
 */
public class MockScanner {
    private Object[] testData; // 테스트 데이터 배열
    private int index = 0; // 현재 데이터 위치

    /**
     * 생성자 - 테스트 데이터를 초기화
     * @param testData 사용할 입력 데이터 배열
     */
    public MockScanner(Object[] testData) {
        this.testData = testData;
    }

    /** 다음 데이터를 int로 반환 */
    public int nextInt() {
        return (int) testData[index++];
    }

    /** 다음 데이터를 double로 반환 */
    public double nextDouble() {
        return (double) testData[index++];
    }

    /** 다음 데이터를 String으로 반환 */
    public String nextString() {
        return (String) testData[index++];
    }

    /** 다음 데이터를 Object[] 배열로 반환 */
    public Object[] nextArray() {
        return (Object[]) testData[index++];
    }
}