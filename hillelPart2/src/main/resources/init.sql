CREATE TABLE public.homework
(
    id          bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    name        text   NOT NULL,
    description text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.homework
    OWNER to postgres;

CREATE TABLE public.lesson
(
    id          bigint                 NOT NULL GENERATED ALWAYS AS IDENTITY,
    name        text                   NOT NULL,
    homework_id bigint                 NOT NULL,
    updated_at  time without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    UNIQUE (homework_id),
    FOREIGN KEY (homework_id)
        REFERENCES public.homework (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION

);

ALTER TABLE IF EXISTS public.lesson
    OWNER to postgres;

CREATE TABLE public.schedule
(
    id         bigint                      NOT NULL GENERATED ALWAYS AS IDENTITY,
    name       text                        NOT NULL,
    updated_at timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.schedule
    OWNER to postgres;

CREATE TABLE public.lessons_schedule
(
    id          bigint NOT NULL,
    lesson_id   bigint NOT NULL,
    schedule_id bigint NOT NULL,
    FOREIGN KEY (lesson_id)
        REFERENCES public.lesson (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    FOREIGN KEY (schedule_id)
        REFERENCES public.schedule (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT id PRIMARY KEY (lesson_id, schedule_id)
);

ALTER TABLE IF EXISTS public.lessons_schedule
    OWNER to postgres;