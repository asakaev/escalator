package wonderland

object MonadInstances {
  implicit val optionMonad: Monad[Option] =
    new Monad[Option] {
      override def pure[A](a: A): Option[A]                                   = Some(a)
      override def flatMap[A, B](fa: Option[A])(f: A => Option[B]): Option[B] = fa.flatMap(f)
    }
}