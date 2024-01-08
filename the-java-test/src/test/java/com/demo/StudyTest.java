package com.demo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName(("스터디 만들기"))
    void create_new_study() {
        assertTimeout(Duration.ofSeconds(100), () -> {
                    new main.java.com.demo.Study(10);
                    Thread.sleep(3100);
                }
                // TODO ThreadLocal
        );

//        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> new Study(10));
//        String message = exception.getMessage();
//        assertEquals("limit 은 0 보다 커야 한다.", message);

        main.java.com.demo.Study study = new main.java.com.demo.Study(10);
        assertNotNull(study);
        // Lambda 를 사용하면 메시지
//        assertEquals(main.java.com.demo.StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 생성하면 상태는 DRAFT 여야 한다.");
//        assertEquals(main.java.com.demo.StudyStatus.DRAFT, study.getStatus(), new Supplier<String>() {
//            @Override
//            public String get() {
//                return "스터디를 처음 만들면 %s 여야 합니다.".formatted(main.java.com.demo.StudyStatus.DRAFT.getValue());
//            }
//        });

        assertTrue(study.getLimit() > 0, "스터티 최대 참석 가능 인원은 0보다 커야 한다.");

        assertAll(
                () -> assertNotNull(study),
                () -> assertEquals(main.java.com.demo.StudyStatus.DRAFT, study.getStatus(),
                        () -> "스터디를 처음 만들면 " + main.java.com.demo.StudyStatus.DRAFT + " 상태다"),
                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0 보다 커야한다.")
        );

        System.out.println(main.java.com.demo.StudyStatus.DRAFT.getValue());
    }

    @Test
    @DisplayName("스터디 만들어봐")
        // @Disabled
    void create_new_study_again() {
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before Each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}