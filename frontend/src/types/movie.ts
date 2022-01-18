export type Movie = {
    id: number;
    title: string;
    score: number;
    count: number;
    image: string;
}

export type moviePage = {
    content: Movie[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}