INSERT INTO tb_user(name, email, password) VALUES ('Alex', 'alex.alex@mail.com', 1234);
INSERT INTO tb_user(name, email, password) VALUES ('Pedro Neto', 'neto.pedro@mail.com', 1234);
INSERT INTO tb_user(name, email, password) VALUES ('Edna', 'edna.polaroid@mail.com', 1234);

INSERT INTO tb_role(authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role(authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role(authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role(user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2, 3);
INSERT INTO tb_user_role(user_id, role_id) VALUES (3, 2);

INSERT INTO tb_course_img (name) VALUES ('https://embarcados.com.br/wp-content/uploads/2014/03/imagem-de-destaque-28-850x510.png');

INSERT INTO tb_course(name, course_img_id) VALUES ('Desenvolvimento back-end com Java', 1);

INSERT INTO tb_notification(text, moment, read, route, user_id) VALUES ('Desenvolvimento back-end com Java', NOW(), false, '/welcome',1);

INSERT INTO tb_offer(edition, start_Moment, end_Moment, course_id) VALUES(1.0, NOW(), NOW(), 1);

INSERT INTO tb_resource(title, description, position, course_img_id, type, offer_id) VALUES ('Trilha Java', 'Aprenda do basico ao avançado em java', 1, 1, 1, 1);
INSERT INTO tb_resource(title, description, position, course_img_id, type, offer_id) VALUES ('Forum', 'Tire suas duvidas', 2, 1, 2, 1);
INSERT INTO tb_resource(title, description, position, course_img_id, type, offer_id) VALUES ('Avaliações', 'Teste seu conhecimento com provas do basico ao avançado', 3, 1, 0, 1);

INSERT INTO tb_section(title, description, position, course_img_id, resource_id, prerequisite_id) VALUES ('Java básico', 'Conheça os fundamentos do java e sua sintaxe', 1, 1, 1, null);
INSERT INTO tb_section(title, description, position, course_img_id, resource_id, prerequisite_id) VALUES ('Avaliação Java basico ', 'Teste seu conhecimento nessa avaliação', 1, 1, 3, null);

INSERT INTO tb_enrollment(user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (1, 1, NOW(), NOW(), true, false);

INSERT INTO tb_lesson(title, position, section_id) VALUES ('Noções de POO', 1, 1);
INSERT INTO tb_content(id, text_Content, video_Uri) VALUES(1, 'Material de apoio: POO', 'https://www.youtube.com/watch?v=dq73as9J2xA');

INSERT INTO tb_lesson(title, position, section_id) VALUES ('Noções de POO 2', 2, 1);
INSERT INTO tb_content(id, text_Content, video_Uri) VALUES(2, '', 'https://www.youtube.com/watch?v=dq73as9J2xA');

INSERT INTO tb_lesson(title, position, section_id) VALUES ('Noções de POO 3', 3, 1);
INSERT INTO tb_content(id, text_Content, video_Uri) VALUES(3, 'Material de apoio: POO', 'https://www.youtube.com/watch?v=dq73as9J2xA');

INSERT INTO tb_lesson(title, position, section_id) VALUES ('Tarefa do capitulo 1', 4, 1);
INSERT INTO tb_task(id, description, question_Count, approval_Count, weight, due_Date) VALUES(4, 'Exercicio para fixação de conteudo', 10, 7, 10, NOW());

INSERT INTO tb_lessons_done(lesson_id, user_id, offer_id) VALUES (1, 1, 1);
INSERT INTO tb_lessons_done(lesson_id, user_id, offer_id) VALUES (2, 1, 1);