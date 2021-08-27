INSERT INTO user(name, email, password) values("gpark", "gpark@naver.com", "1234");
INSERT INTO user(name, email, password)values("ekwon", "ekwon@naver.com", "1234");
INSERT INTO user(name, email, password) values("sun-kim", "sun-kim@naver.com", "1234");

INSERT INTO todo(id, user_id, title, target_from, target_to, is_checked, category) VALUES (null, 1, "spring", now(), now(), false, "");
INSERT INTO todo(id, user_id, title, target_from, target_to, is_checked, category) VALUES (null, 1, "java", now(), now(), false, "");
INSERT INTO todo(id, user_id, title, target_from, target_to, is_checked, category) VALUES (null, 2, "swift", now(), now(), false, "");
INSERT INTO todo(id, user_id, title, target_from, target_to, is_checked, category) VALUES (null, 2, "react", now(), now(), false, "");
INSERT INTO todo(id, user_id, title, target_from, target_to, is_checked, category) VALUES (null, 3, "algorithm", now(), now(), false, "");
INSERT INTO todo(id, user_id, title, target_from, target_to, is_checked, category) VALUES (null, 3, "python", now(), now(), false, "");
INSERT INTO todo(id, user_id, title, is_checked, category) VALUES (null, 3, "i don't have date", false, "");