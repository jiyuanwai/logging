package com.jiyuanwai.logging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j
class TestLog {

	static final org.slf4j.Logger logger = LoggerFactory.getLogger(TestLog.class);
	static final org.slf4j.Logger anotherLog = LoggerFactory.getLogger("anotherLog");

	@Test
	void testLog() {

		log.trace("A TRACE Message");
		log.debug("A DEBUG Message");
		log.info("An INFO Message");
		log.warn("A WARN Message");
		log.error("An ERROR Message");

		String level = "Trace";
		// 反例
		logger.trace("A " + level + " Message");
		// 正确的做法
		logger.trace("A {} Message", level);

		// 两个日志实例是相同的
		assertEquals(log, logger);

		assertNotEquals(log, anotherLog);
	}
}
