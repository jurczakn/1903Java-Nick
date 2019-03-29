import { MoviePipePipe } from './movie-pipe.pipe';

describe('MoviePipePipe', () => {
  it('create an instance', () => {
    const pipe = new MoviePipePipe();
    expect(pipe).toBeTruthy();
  });
});
