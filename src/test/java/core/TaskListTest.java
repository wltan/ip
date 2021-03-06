package core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.DataException;
import tasks.Todo;

public class TaskListTest {

    @BeforeEach
    public void reset() {
        // clear all tasks in TaskList
        IntStream.range(0, TaskList.size()).forEach(i -> TaskList.remove(0));
    }

    @Test
    public void testAdd() throws DataException {
        TaskList.add(new Todo("foo"));
        assertEquals(TaskList.size(), 1);
    }

    @Test
    public void testEmpty() {
        assertEquals(TaskList.size(), 0);
    }

}
